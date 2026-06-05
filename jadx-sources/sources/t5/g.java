package t5;

import android.text.InputFilter;
import android.widget.TextView;
import r5.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final f f15813c;

    public g(TextView textView) {
        this.f15813c = new f(textView);
    }

    @Override // a.a
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        return !k.d() ? inputFilterArr : this.f15813c.C(inputFilterArr);
    }

    @Override // a.a
    public final void V(boolean z2) {
        if (k.d()) {
            this.f15813c.V(z2);
        }
    }

    @Override // a.a
    public final void W(boolean z2) {
        boolean zD = k.d();
        f fVar = this.f15813c;
        if (zD) {
            fVar.W(z2);
        } else {
            fVar.f15812e = z2;
        }
    }
}
