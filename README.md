# Java TCP/UDP Client-Server Implementation

A simple yet robust implementation of TCP and UDP client-server communication in Java. This project demonstrates the fundamental differences between TCP and UDP protocols and provides working examples of both.

## 🌟 Features

- TCP Server and Client implementation
- UDP Server and Client implementation
- Support for concurrent client connections (TCP)
- Basic message exchange functionality
- Proper resource management and error handling
- Well-documented code with examples

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Basic understanding of networking concepts
- A Java IDE (optional, but recommended)

## 🛠️ Project Structure

```
tcp-udp-java/
├── src.com.networking/
│   ├── tcp/
│   │   ├── TCPServer.java
│   │   └── TCPClient.java
│   └── udp/
│       ├── UDPServer.java
│       └── UDPClient.java
├── README.md
└── pom.xml
```

## 🚀 Getting Started

### Compiling the Project

1. Navigate to the project directory:
```bash
cd tcp-udp-java
```

2. Compile the Java files:
```bash
javac src/tcp/*.java src/udp/*.java
```

### Running TCP Implementation

1. Start the TCP Server:
```bash
java src.tcp.TCPServer
```

2. In a new terminal, start the TCP Client:
```bash
java src.tcp.TCPClient
```

### Running UDP Implementation

1. Start the UDP Server:
```bash
java src.udp.UDPServer
```

2. In a new terminal, start the UDP Client:
```bash
java src.udp.UDPClient
```

## 📝 Usage Examples

```

## 🔍 Key Differences Between TCP and UDP

### TCP
- Connection-oriented
- Guaranteed delivery
- Order preservation
- Error checking
- Suitable for: Web browsing, email, file transfer

### UDP
- Connectionless
- No delivery guarantee
- No order preservation
- Faster transmission
- Suitable for: Streaming, gaming, VoIP

## ⚙️ Configuration

Both TCP and UDP implementations use default ports:
- TCP Server: Port 2020
- UDP Server: Port 2021

To change these ports, modify the port numbers in the respective server files.

## 🧪 Testing

1. Basic Connectivity Test:
```bash
# Start server
java src.com.networking.tcp.TCPServer

# In another terminal, run client
java src.com.networking.tcp.TCPClient
```

2. Multiple Client Test (TCP):
```bash
# Start multiple client instances
java src.com.networking.tcp.TCPClient
java src.com.networking.tcp.TCPClient
```

## 🚧 Known Issues

- Large messages (>65,535 bytes) need to be handled specially in UDP
- No built-in reconnection mechanism for TCP
- Basic error handling (can be enhanced for production use)

## 🔮 Future Improvements

- [ ] Add SSL/TLS support for TCP
- [ ] Implement connection pooling
- [ ] Add message queuing
- [ ] Improve error handling
- [ ] Add connection timeout handling
- [ ] Implement message fragmentation for UDP
- [ ] Add logging framework
- [ ] Create configuration file support


