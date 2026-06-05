package sd;

import android.os.Parcel;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final e CREATOR = new e();
    public final Class A;
    public final String B;
    public h C;
    public final rd.a D;

    /* renamed from: a, reason: collision with root package name */
    public final int f14971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14972b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14974d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14975e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14976f;

    /* renamed from: z, reason: collision with root package name */
    public final int f14977z;

    public a(int i10, int i11, boolean z2, int i12, boolean z10, String str, int i13, String str2, rd.b bVar) {
        this.f14971a = i10;
        this.f14972b = i11;
        this.f14973c = z2;
        this.f14974d = i12;
        this.f14975e = z10;
        this.f14976f = str;
        this.f14977z = i13;
        if (str2 == null) {
            this.A = null;
            this.B = null;
        } else {
            this.A = d.class;
            this.B = str2;
        }
        if (bVar == null) {
            this.D = null;
            return;
        }
        rd.a aVar = bVar.f14365b;
        if (aVar == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.D = aVar;
    }

    public static a b(int i10, String str) {
        return new a(7, true, 7, true, str, i10, null);
    }

    public final String toString() {
        j jVar = new j(this);
        jVar.g(Integer.valueOf(this.f14971a), "versionCode");
        jVar.g(Integer.valueOf(this.f14972b), "typeIn");
        jVar.g(Boolean.valueOf(this.f14973c), "typeInArray");
        jVar.g(Integer.valueOf(this.f14974d), "typeOut");
        jVar.g(Boolean.valueOf(this.f14975e), "typeOutArray");
        jVar.g(this.f14976f, "outputFieldName");
        jVar.g(Integer.valueOf(this.f14977z), "safeParcelFieldId");
        String str = this.B;
        if (str == null) {
            str = null;
        }
        jVar.g(str, "concreteTypeName");
        Class cls = this.A;
        if (cls != null) {
            jVar.g(cls.getCanonicalName(), "concreteType.class");
        }
        rd.a aVar = this.D;
        if (aVar != null) {
            jVar.g(aVar.getClass().getCanonicalName(), "converterName");
        }
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f14971a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f14972b);
        uk.c.k0(parcel, 3, 4);
        parcel.writeInt(this.f14973c ? 1 : 0);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f14974d);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f14975e ? 1 : 0);
        uk.c.c0(parcel, 6, this.f14976f, false);
        uk.c.k0(parcel, 7, 4);
        parcel.writeInt(this.f14977z);
        rd.b bVar = null;
        String str = this.B;
        if (str == null) {
            str = null;
        }
        uk.c.c0(parcel, 8, str, false);
        rd.a aVar = this.D;
        if (aVar != null) {
            if (!(aVar instanceof rd.a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            bVar = new rd.b(aVar);
        }
        uk.c.b0(parcel, 9, bVar, i10, false);
        uk.c.j0(iH0, parcel);
    }

    public a(int i10, boolean z2, int i11, boolean z10, String str, int i12, Class cls) {
        this.f14971a = 1;
        this.f14972b = i10;
        this.f14973c = z2;
        this.f14974d = i11;
        this.f14975e = z10;
        this.f14976f = str;
        this.f14977z = i12;
        this.A = cls;
        if (cls == null) {
            this.B = null;
        } else {
            this.B = cls.getCanonicalName();
        }
        this.D = null;
    }
}
