### environment R version 3.3.2
library(jiebaR)
library(readr)
library(wordVectors)

## declare segmentation worker  
cutter = worker(type = "mix", bylines = T, stop_word = "stop_words.utf8", user = "user.dict.utf8") 
## read input file
text <- read_file("allSnippets.txt")
article_words = segment(text, cutter)
article_words_vec = sapply(article_words, paste, collapse = " ")
writeLines(article_words_vec, "article_words_vec.txt")
## build skip-gram model (if wanna train cbow model, add param: cbow = 1)
model = train_word2vec("article_words_vec.txt", output="article_words.bin", threads = 3, vectors = 300, window = 7, force = T,  min_count = 7)
## write model to csv file
write.csv(model, "model.csv")

## check out closest 15 similarities 
nearest_to(model, model[["即溶"]], n = 15)

## get cosineSimilarity 
cosineSimilarity(model[["巧克力"]], model[["哈根"]]+model[["達斯"]])
cosineDist(model[["巧克力"]], model[["哈根"]]+model[["達斯"]])

## plot model
plot(model)


