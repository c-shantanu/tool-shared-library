def call() {
  ---
- name: Install node exporter
  hosts: test1
  tasks:
    - name: Ensure the required packages are installed
      become: yes
      package:
        name: 
          - wget
          - tar
      ignore_errors: yes
​
    - name: Create a directory for node exporter installation
      become: yes
      file:
        path: /home/node_exporter
        state: directory
​
    - name: Download node exporter
      become: yes
      get_url:
        url: https://github.com/prometheus/node_exporter/releases/download/v1.6.1/node_exporter-1.6.1.linux-amd64.tar.gz
        dest: /home/node_exporter/node_exporter-1.6.1.linux-amd64.tar.gz
​
    - name: Extract node exporter
      become: yes
      ansible.builtin.unarchive:
        src: /home/node_exporter/node_exporter-1.6.1.linux-amd64.tar.gz
        dest: /home/node_exporter/
        remote_src: yes
}
