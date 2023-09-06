import { CompletionItem } from 'vscode-languageserver-types';
export interface Suggester {
    availableSymbols(): CompletionItem[];
}

export interface SuggestionSymbol {
    label: string;
    detail: string;
    documentation: string;
    type: string;
    parent: string;
    data:any;
}

export interface CodeAndPosition {
    code: string;
    start: number;
    end: number;
}