package t5;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import r5.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f15806a;

    /* renamed from: b, reason: collision with root package name */
    public c f15807b;

    public d(TextView textView) {
        this.f15806a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f15806a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = k.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return k.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        k kVarA = k.a();
        if (this.f15807b == null) {
            this.f15807b = new c(textView, this);
        }
        kVarA.h(this.f15807b);
        return charSequence;
    }
}
