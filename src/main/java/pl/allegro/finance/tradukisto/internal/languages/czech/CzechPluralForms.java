package pl.allegro.finance.tradukisto.internal.languages.czech;

import com.google.common.collect.Range;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;

public class CzechPluralForms implements PluralForms {

    private final String singularForm;
    private final String pluralForm;
    private final String genitivePluralForm;

    public CzechPluralForms(String singularForm, String pluralForm, String genitivePluralForm) {
        this.singularForm = singularForm;
        this.pluralForm = pluralForm;
        this.genitivePluralForm = genitivePluralForm;
    }

    @Override
    public String formFor(Integer value) {
        if (value == 1) {
            return singularForm;
        } else if (Range.closed(2, 4).contains(value)) {
            return pluralForm;
        }

        return genitivePluralForm;
    }
}
