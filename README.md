# Traffic Logic
Data pipeline for Ivy (video-based object counting software).

## Architecture
![](traffic_logic_architecture.png)

# Setup
- Build and run containers: `docker-compose up --build`.

# Demo
- Stream video to server with ffmpeg: `ffmpeg -re -i data/videos/demo.mp4 -c copy -f flv rtmp://localhost:1935/stream/ivy?secret_key=secret419`.
- Monitor video stream and logs in real time: http://localhost:6969.
