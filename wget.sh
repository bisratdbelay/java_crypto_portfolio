#!/bin/bash

wget https://api.exchange.coinbase.com/products/BTC-USD/ticker
cat ticker | cut -d "," -f5 | cut -d ":" -f2 | cut -d '"' -f2 > text.txt
rm ticker
