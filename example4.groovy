options.trustUnknownHosts = true

remoteSession {
  url = 'root:123456@localhost:22'
  
  exec(showOutput: false, command: 'ls -l')
}
