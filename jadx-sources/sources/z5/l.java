package z5;

import androidx.gridlayout.widget.GridLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final l f20431e = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.J, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20432a;

    /* renamed from: b, reason: collision with root package name */
    public final i f20433b;

    /* renamed from: c, reason: collision with root package name */
    public final u0.b f20434c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20435d;

    public l(boolean z2, i iVar, u0.b bVar, float f10) {
        this.f20432a = z2;
        this.f20433b = iVar;
        this.f20434c = bVar;
        this.f20435d = f10;
    }

    public final u0.b a(boolean z2) {
        b bVar = GridLayout.J;
        u0.b bVar2 = this.f20434c;
        return bVar2 != bVar ? bVar2 : this.f20435d == 0.0f ? z2 ? GridLayout.M : GridLayout.R : GridLayout.S;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f20434c.equals(lVar.f20434c) && this.f20433b.equals(lVar.f20433b);
    }

    public final int hashCode() {
        return this.f20434c.hashCode() + (this.f20433b.hashCode() * 31);
    }
}
