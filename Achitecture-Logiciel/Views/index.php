<?php

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Actualités MGLSI</title>
    <!-- Stylesheets -->
	<link rel="stylesheet" type="text/css" href="assets/css/style1.css">
</head>
<body>
    <?php require_once('entete.php');?>
    <div id="contenu">
        <?php 
            $controller = new Controller();
            if(!isset($_GET['categorie']))
            {
            $articles = $controller->allArticles; 
            if(count($articles) == 0)
                echo "<h1>Aucun article trouvé !</h1>";
            else
                foreach ($articles as $article)
                {?>
                    <div class="article">
                        <h1><a href="article/<?= $article->getId() ?>"><?php echo mb_convert_encoding($article->getTitre(),'utf-8'); ?></a></h1>
                        <p><?= substr($article->getContenu(), 0, 300) . '...' ?></p>
                    </div><?php
                }

            }
            else
            {
            $itemArticles = $controller->articleByCategory($_GET['categorie']);
            if(count($itemArticles) == 0)
                echo "<h1>Aucun article trouvé !</h1>";
            else
                foreach ($itemArticles as $article)
                {?>
                    <div class="article">
                        <h1><a href="article/<?= $article->id ?>"><?php echo mb_convert_encoding($article->titre,'utf-8'); ?></a></h1>
                        <p><?= substr($article->contenu, 0, 300) . '...' ?></p>
                    </div><?php
                }
            }       
        ?>
    </div>
    <?php require_once('menu.php'); ?>
</body>
</html>
