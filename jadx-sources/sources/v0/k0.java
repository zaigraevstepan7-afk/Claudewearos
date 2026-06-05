package v0;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17413a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17414b;

    /* renamed from: c, reason: collision with root package name */
    public final TextClassification f17415c;

    public k0(CharSequence charSequence, long j, TextClassification textClassification) {
        this.f17413a = charSequence;
        this.f17414b = j;
        this.f17415c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return fj.l.b(this.f17413a, k0Var.f17413a) && g3.m0.b(this.f17414b, k0Var.f17414b) && fj.l.b(this.f17415c, k0Var.f17415c);
    }

    public final int hashCode() {
        int iHashCode = this.f17413a.hashCode() * 31;
        int i10 = g3.m0.f7144c;
        return this.f17415c.hashCode() + gk.b.j(iHashCode, this.f17414b, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f17413a) + ", selection=" + ((Object) g3.m0.h(this.f17414b)) + ", textClassification=" + this.f17415c + ')';
    }
}
