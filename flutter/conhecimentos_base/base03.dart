main(){
  Map<String, String> telefones = {
    'João Sede': '21-2342-2423',
    'Claudio Santos': '32-2342-4544'
  };

  print(telefones is Map);
  print(telefones);
  print(telefones['Claudio Santos']);
  print(telefones.values);
  print(telefones.keys);
  print(telefones.length);

  var times = {'vasco', 'fluminense', 'flamengo'};

}