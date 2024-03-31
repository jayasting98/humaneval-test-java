import argparse
import json
import os
import pathlib


def main(args: argparse.Namespace) -> None:
    with open(args.data_path) as data_file:
        sample_strs = data_file.readlines()
    samples = map(json.loads, sample_strs)
    subproject: str = args.subproject
    package: str = args.package
    for i, sample in enumerate(samples):
        task_package = f'{package}.task{i}'
        path_dir_names = [subproject, 'src', None, 'java']
        path_dir_names.extend(task_package.split('.'))
        focal_path_names = list(path_dir_names)
        focal_path_names[2] = 'main'
        focal_path_names.append('Solution.java')
        focal_file_pathname = os.path.join(*focal_path_names)
        focal_dir_path = pathlib.Path(focal_file_pathname).parent
        focal_dir_path.mkdir(parents=True, exist_ok=True)
        focal_file_content = f'package {task_package};\n\n'
        focal_file_content += sample['declaration']
        focal_file_content += sample['canonical_solution']
        focal_file_content += '\n'
        with open(focal_file_pathname, mode='w') as focal_file:
            focal_file.write(focal_file_content)
        test_path_names = list(path_dir_names)
        test_path_names[2] = 'test'
        test_path_names.append('Main.java')
        test_file_pathname = os.path.join(*test_path_names)
        test_dir_path = pathlib.Path(test_file_pathname).parent
        test_dir_path.mkdir(parents=True, exist_ok=True)
        test_file_content = f'package {task_package};\n\n'
        test_file_content += sample['test']
        test_file_content += '\n'
        with open(test_file_pathname, mode='w') as test_file:
            test_file.write(test_file_content)


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('data_path')
    parser.add_argument('--subproject', default='humaneval-test-original')
    parser.add_argument('--package', default='humanevaltest.original')
    args = parser.parse_args()
    main(args)
