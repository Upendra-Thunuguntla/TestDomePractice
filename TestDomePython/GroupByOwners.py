def group_by_owners(files):
    ret = {}
    for val in files.values():
        ret[val] = []
    for k,v in files.items():
        ret[v] = ret[v]+[k]
    return ret
    
if __name__ == "__main__":    
    files = {
        'Input.txt': 'Randy',
        'Code.py': 'Stan',
        'Output.txt': 'Randy'
    }   
    print(group_by_owners(files))
