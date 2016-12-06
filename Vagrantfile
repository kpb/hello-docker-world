# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

  config.vm.box = "bento/debian-8.6"

  # Create a forwarded port mapping which allows access to a specific port
  # within the machine from a port on the host machine. In the example below,
  # accessing "localhost:8080" will access port 80 on the guest machine.
  config.vm.network "forwarded_port", guest: 8080, host: 8080

  # Create a private network, which allows host-only access to the machine
  # using a specific IP.
  # config.vm.network "private_network", ip: "192.168.33.10"

  # Share an additional folder to the guest VM. The first argument is
  # the path on the host to the actual folder. The second argument is
  # the path on the guest to mount the folder.
  # I use this to share a project that I'd like to build/run in the box via docker.
  # config.vm.synced_folder "/host/dir", "/guest/dir"

  config.vm.provider "virtualbox" do |vb|
    vb.name = "hello-docker-world"
    vb.memory = 2048
  end

  config.vm.provision "ansible_local" do |ansible|
    ansible.playbook = "provisioning/docker-dev.yml"
    ansible.sudo = true
    # set to 'true', '-vvv', etc for debug
    ansible.verbose = false
  end
  
end
