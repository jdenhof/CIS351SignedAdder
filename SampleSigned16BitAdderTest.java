<!DOCTYPE html>
<html lang="en" class="bg-dark">
<head>
  <meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>
  
        
    
    PrairieLearn
  
</title>

<link href="/cacheable_node_modules/30200b7b4bbaba6b/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />
<link href="/cacheable_node_modules/cd84b52f86059d3a/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet" />
<link href="/assets/74bff2f9373f8e24/stylesheets/colors.css" rel="stylesheet" />
<link href="/assets/74bff2f9373f8e24/stylesheets/local.css" rel="stylesheet" />
<script src="/cacheable_node_modules/52e4e2a5e60b8522/jquery/dist/jquery.min.js"></script>
<script src="/cacheable_node_modules/30200b7b4bbaba6b/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<script src="/cacheable_node_modules/7074a3967ab9fee5/@fortawesome/fontawesome-free/js/all.min.js"></script>
<script src="/cacheable_node_modules/892bef45a1a5205b/js-cookie/dist/js.cookie.min.js"></script>

  <style>
  html, body {
    height: 100%;
    background-color: #e9ecef;
  }
  .login-container-wrapper {
    width: 100%;
    height: 100%;
  }
  .login-container {
    background-color: white;
    padding: 20px;
    height: 100%;
  }
  .login-methods > :not(:last-child) {
    margin-bottom: 0.5rem;
  }
  @media (min-width: 576px) {
    .login-container-wrapper {
      max-width: 500px;
      margin: auto;
      height: auto;
    }
    .login-container {
      border-radius: 5px;
      box-shadow: 0 19px 38px rgba(0,0,0,0.30), 0 15px 12px rgba(0,0,0,0.22);
      height: auto;
      margin: 20px;
    }
  }
  .subheader {
    font-weight: 300;
    font-size: 1.2rem;
  }
  .btn .social-icon {
    position: absolute;
    left: 7px;
    height: 24px;
    top: 0;
    bottom: 0;
    margin: auto;
  }
  .btn-shib {
    background-color: #E84A27;
    border-color: #E84A27;
    color: white;
  }
  .btn-shib:hover {
    background-color: #D04223;
    border-color: #D04223;
    color: white;
  }
  .btn-shib:focus {
    box-shadow: 0 0 0 0.2rem rgba(255, 83, 0, 0.35);
  }
  .btn-shib:active {
    background-color: #B93B1F;
    border-color: #B93B1F;
    color: white;
  }
  
  .institution-header {
    overflow: hidden;
    text-align: center;
  }
  .institution-header:before, .institution-header:after {
    background-color: #000;
    content: "";
    display: inline-block;
    height: 1px;
    position: relative;
    vertical-align: middle;
    width: 50%;
  }
  .institution-header:before {
    right: 0.5em;
    margin-left: -50%;
  }
  .institution-header:after {
    left: 0.5em;
    margin-right: -50%;
  }
  
  </style>
</head>
<body class="d-flex bg-dark">
  <div class="login-container-wrapper">
    <div class="login-container">
      <div>
        <h1 class="text-center">PrairieLearn</h1>
        <h2 class="text-center subheader">
          Sign in
          
        </h2>
        <div class="login-methods mt-5">
          
          
          
            <a class="btn btn-primary w-100 position-relative" href="/pl/oauth2login" role="button">
              <img src="/images/google_logo.svg" class="social-icon"/>
              <span class="font-weight-bold">Sign in with Google
            </a>
          
          
            <a class="btn btn-dark w-100 position-relative" href="/pl/azure_login" role="button">
              <img src="/images/ms_logo.svg" class="social-icon"/>
              <span class="font-weight-bold">Sign in with Microsoft</span>
            </a>
          
        </div>
        
          <div class="institution-header text-muted my-3">
            Institution sign-on
          </div>
          <div class="login-methods">
          
            <a href="/pl/auth/institution/3/saml/login" class="btn btn-outline-dark btn-block">
              University of Illinois at Urbana-Champaign (UIUC)
            </a>
          
            <a href="/pl/auth/institution/6/saml/login" class="btn btn-outline-dark btn-block">
              University of Maryland (umd.edu)
            </a>
          
          </div>
        
      </div>
    </div>
  </div>
</body>
</html>
