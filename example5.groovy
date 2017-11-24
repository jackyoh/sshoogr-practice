options.trustUnknownHosts = true

remoteSession {
  url = 'root:123456@server-a1:22'
  
  //exec(showOutput: false, command: 'ls -l')
  prefix("ls") {
     exec '-l'
     exec '-al'
  }
}
