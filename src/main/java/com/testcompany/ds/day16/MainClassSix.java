package com.testcompany.ds.day16;

import com.testcompany.ds.day13.FinalSortingClass;

import java.util.Arrays;

public class MainClassSix {

    public static void main(String[] args) {
        int [] arr  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        SortingClass finalSortingClass = new SortingClass();
        System.out.println(" Merge sorting  === "+ Arrays.toString(finalSortingClass.mergeSort(arr,0 ,arr.length -1)));


    }

    //SELECT [ALL|DISTINCT] named_expression[, named_expression, ...]
    //    FROM relation[, relation, ...]
    //    [lateral_view[, lateral_view, ...]]
    //    [WHERE boolean_expression]
    //    [aggregation [HAVING boolean_expression]]
    //    [ORDER BY sort_expressions]
    //    [CLUSTER BY expressions]
    //    [DISTRIBUTE BY expressions]
    //    [SORT BY sort_expressions]
    //    [WINDOW named_window[, WINDOW named_window, ...]]
    //    [LIMIT num_rows]
    //
    //named_expression:
    //    : expression [AS alias]
    //
    //relation:
    //    | join_relation
    //    | (table_name|query|relation) [sample] [AS alias]
    //    : VALUES (expressions)[, (expressions), ...]
    //          [AS (column_name[, column_name, ...])]
    //
    //expressions:
    //    : expression[, expression, ...]
    //
    //sort_expressions:
    //    : expression [ASC|DESC][, expression [ASC|DESC], ...]
}
