<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Stream Viewer - Traffic Logic</title>

  <link href="//vjs.zencdn.net/7.10.2/video-js.min.css" rel="stylesheet">
  <script src="//vjs.zencdn.net/7.10.2/video.min.js"></script>
</head>

<body>
  <h1>Traffic Logic Stream Viewer</h1>

  <video
    id="stream-player"
    class="video-js"
    width="1280"
    height="720"
    controls
    preload="auto"
    autoplay
    data-setup='{"liveui": true}'>
      <source src="http://${tl_user}:${tl_password}@localhost:8420/hls/ivy.m3u8" type="application/x-mpegURL">

      <p class="vjs-no-js">
        To view this video please enable JavaScript, and consider upgrading to a
        web browser that
        <a href="https://videojs.com/html5-video-support/" target="_blank">
          supports HTML5 video
        </a>
      </p>
  </video>

</body>
</html>
