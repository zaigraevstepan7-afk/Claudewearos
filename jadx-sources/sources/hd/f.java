package hd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends od.a {
    public static final Parcelable.Creator<f> CREATOR = new gd.g(4);
    public final boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final e f7857a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7858b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7859c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7860d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7861e;

    /* renamed from: f, reason: collision with root package name */
    public final d f7862f;

    /* renamed from: z, reason: collision with root package name */
    public final c f7863z;

    public f(e eVar, b bVar, String str, boolean z2, int i10, d dVar, c cVar, boolean z10) {
        e0.i(eVar);
        this.f7857a = eVar;
        e0.i(bVar);
        this.f7858b = bVar;
        this.f7859c = str;
        this.f7860d = z2;
        this.f7861e = i10;
        this.f7862f = dVar == null ? new d(null, null, false) : dVar;
        this.f7863z = cVar == null ? new c(null, false) : cVar;
        this.A = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e0.l(this.f7857a, fVar.f7857a) && e0.l(this.f7858b, fVar.f7858b) && e0.l(this.f7862f, fVar.f7862f) && e0.l(this.f7863z, fVar.f7863z) && e0.l(this.f7859c, fVar.f7859c) && this.f7860d == fVar.f7860d && this.f7861e == fVar.f7861e && this.A == fVar.A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7857a, this.f7858b, this.f7862f, this.f7863z, this.f7859c, Boolean.valueOf(this.f7860d), Integer.valueOf(this.f7861e), Boolean.valueOf(this.A)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f7857a, i10, false);
        uk.c.b0(parcel, 2, this.f7858b, i10, false);
        uk.c.c0(parcel, 3, this.f7859c, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f7860d ? 1 : 0);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f7861e);
        uk.c.b0(parcel, 6, this.f7862f, i10, false);
        uk.c.b0(parcel, 7, this.f7863z, i10, false);
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
