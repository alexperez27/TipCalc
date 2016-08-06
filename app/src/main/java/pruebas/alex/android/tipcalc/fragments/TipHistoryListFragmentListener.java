package pruebas.alex.android.tipcalc.fragments;

import pruebas.alex.android.tipcalc.models.TipRecord;

/**
 * Created by alexander on 06-24-16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord tipRecord);
    void clearList();
}
