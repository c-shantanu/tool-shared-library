def call() {
---
- name: Install Prometheus
  hosts: all
  tasks:
    - name: Ensure the required packages are installed
      become: yes
      package:
        name: 
          - wget
          - tar
      ignore_errors: yes
​
    - name: Create a directory for Prometheus installation
      become: yes
      file:
        path: /home/prometheus
        state: directory
​
    - name: Download Prometheus archive
      become: yes
      get_url:
        url: https://github.com/prometheus/prometheus/releases/download/v2.47.1/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
​
    - name: Extract Prometheus archive
      become: yes
      ansible.builtin.unarchive:
        src: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus
        remote_src: yes
        creates: /home/prometheus/prometheus-2.47.1.linux-amd64
​
    - name: Prometheus configuration file
      template:
        src: prometheus.yml.j2
        dest: /etc/prometheus/prometheus.yml
      notify: restart prometheus    
---
- name: Install Prometheus
  hosts: all
  tasks:
    - name: Ensure the required packages are installed
      become: yes
      package:
        name: 
          - wget
          - tar
      ignore_errors: yes
​
    - name: Create a directory for Prometheus installation
      become: yes
      file:
        path: /home/prometheus
        state: directory
​
    - name: Download Prometheus archive
      become: yes
      get_url:
        url: https://github.com/prometheus/prometheus/releases/download/v2.47.1/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
​
    - name: Extract Prometheus archive
      become: yes
      ansible.builtin.unarchive:
        src: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus
        remote_src: yes
        creates: /home/prometheus/prometheus-2.47.1.linux-amd64
​
    - name: Prometheus configuration file
      template:
        src: prometheus.yml.j2
        dest: /etc/prometheus/prometheus.yml
      notify: restart prometheus    
---
- name: Install Prometheus
  hosts: all
  tasks:
    - name: Ensure the required packages are installed
      become: yes
      package:
        name: 
          - wget
          - tar
      ignore_errors: yes
​
    - name: Create a directory for Prometheus installation
      become: yes
      file:
        path: /home/prometheus
        state: directory
​
    - name: Download Prometheus archive
      become: yes
      get_url:
        url: https://github.com/prometheus/prometheus/releases/download/v2.47.1/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
​
    - name: Extract Prometheus archive
      become: yes
      ansible.builtin.unarchive:
        src: /home/prometheus/prometheus-2.47.1.linux-amd64.tar.gz
        dest: /home/prometheus
        remote_src: yes
        creates: /home/prometheus/prometheus-2.47.1.linux-amd64
​
    - name: Prometheus configuration file
      template:
        src: prometheus.yml.j2
        dest: /etc/prometheus/prometheus.yml
      notify: restart prometheus    
}
