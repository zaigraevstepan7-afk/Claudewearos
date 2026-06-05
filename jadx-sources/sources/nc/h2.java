package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h2 extends od.a {
    public static final Parcelable.Creator<h2> CREATOR = new ig.e0(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f12114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12116c;

    /* renamed from: d, reason: collision with root package name */
    public h2 f12117d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f12118e;

    public h2(int i10, String str, String str2, h2 h2Var, IBinder iBinder) {
        this.f12114a = i10;
        this.f12115b = str;
        this.f12116c = str2;
        this.f12117d = h2Var;
        this.f12118e = iBinder;
    }

    public final fc.a b() {
        h2 h2Var = this.f12117d;
        fc.a aVar = null;
        if (h2Var != null) {
            String str = h2Var.f12116c;
            aVar = new fc.a(h2Var.f12114a, h2Var.f12115b, str, null);
        }
        return new fc.a(this.f12114a, this.f12115b, this.f12116c, aVar);
    }

    public final fc.m c() {
        fc.a aVar;
        i2 f2Var;
        h2 h2Var = this.f12117d;
        if (h2Var == null) {
            aVar = null;
        } else {
            aVar = new fc.a(h2Var.f12114a, h2Var.f12115b, h2Var.f12116c, null);
        }
        IBinder iBinder = this.f12118e;
        if (iBinder == null) {
            f2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            f2Var = iInterfaceQueryLocalInterface instanceof i2 ? (i2) iInterfaceQueryLocalInterface : new f2(iBinder);
        }
        return new fc.m(this.f12114a, this.f12115b, this.f12116c, aVar, f2Var != null ? new fc.t(f2Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12114a);
        uk.c.c0(parcel, 2, this.f12115b, false);
        uk.c.c0(parcel, 3, this.f12116c, false);
        uk.c.b0(parcel, 4, this.f12117d, i10, false);
        uk.c.X(parcel, 5, this.f12118e);
        uk.c.j0(iH0, parcel);
    }
}
