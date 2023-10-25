from scapy.all import *
from scapy.layers.http import HTTPRequest
from scapy.layers.dns import DNSRR, DNS, DNSQR


def proses_pak(pak):
    if pak.haslayer(DHCP):
            print(pak)
    if pak.haslayer(HTTPRequest):
            print(pak)
    if pak.haslayer(DNS):
        print(pak)

user_input = input("what would you like to capture? DNS, DHCP, HTTP (Enter: DN or DH or H): ")

while(user_input != "DN" and user_input != "DH" and user_input != "H"):
    user_input = input("what would you like to capture? DNS, DHCP, HTTP (Enter: DN or DH or H): ")

if(user_input == "DN"):
    sniff(prn=proses_pak, filter="udp port 53", iface="en0", store=False)

if(user_input == "DH"):
    sniff(prn = proses_pak, filter="udp and (port 67 or port 68)", iface="en0", store=False)

if(user_input == "H"):
    sniff(prn = proses_pak, filter="port  80", iface="en0", store=False)



