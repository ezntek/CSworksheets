rebuild: clean main.pdf

main.pdf:
	latexmk -pdf -lualatex -shell-escape main.tex

.PHONY: clean
clean:
	rm -f *.aux *.log *.bbl *.blg *.dvi *.ps *.toc *.lof *.lot main.pdf
