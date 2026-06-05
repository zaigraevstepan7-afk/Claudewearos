package pc;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends od.a {
    public static final Parcelable.Creator<e> CREATOR = new e0(29);
    public final Intent A;
    public final a B;
    public final boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final String f12830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12832c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12833d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12834e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12835f;

    /* renamed from: z, reason: collision with root package name */
    public final String f12836z;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z2) {
        this.f12830a = str;
        this.f12831b = str2;
        this.f12832c = str3;
        this.f12833d = str4;
        this.f12834e = str5;
        this.f12835f = str6;
        this.f12836z = str7;
        this.A = intent;
        this.B = (a) xd.b.u(xd.b.n(iBinder));
        this.C = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, this.f12830a, false);
        uk.c.c0(parcel, 3, this.f12831b, false);
        uk.c.c0(parcel, 4, this.f12832c, false);
        uk.c.c0(parcel, 5, this.f12833d, false);
        uk.c.c0(parcel, 6, this.f12834e, false);
        uk.c.c0(parcel, 7, this.f12835f, false);
        uk.c.c0(parcel, 8, this.f12836z, false);
        uk.c.b0(parcel, 9, this.A, i10, false);
        uk.c.X(parcel, 10, new xd.b(this.B).asBinder());
        uk.c.k0(parcel, 11, 4);
        parcel.writeInt(this.C ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new xd.b(aVar).asBinder(), false);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new xd.b(aVar).asBinder(), false);
    }
}
