package bf;

import android.graphics.Typeface;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f1749b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f1750c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1751d;

    public a(a0 a0Var, Typeface typeface) {
        this.f1749b = typeface;
        this.f1750c = a0Var;
    }

    @Override // x8.a
    public final void R(int i10) {
        if (this.f1751d) {
            return;
        }
        ze.b bVar = (ze.b) this.f1750c.f18604a;
        if (bVar.l(this.f1749b)) {
            bVar.j(false);
        }
    }

    @Override // x8.a
    public final void S(Typeface typeface, boolean z2) {
        if (this.f1751d) {
            return;
        }
        ze.b bVar = (ze.b) this.f1750c.f18604a;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
