package ig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f0 extends c {
    public static final Parcelable.Creator<f0> CREATOR = new e0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f8540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8541b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8542c;

    /* renamed from: d, reason: collision with root package name */
    public final zzags f8543d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8544e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8545f;

    /* renamed from: z, reason: collision with root package name */
    public final String f8546z;

    public f0(String str, String str2, String str3, zzags zzagsVar, String str4, String str5, String str6) {
        this.f8540a = zzah.zzb(str);
        this.f8541b = str2;
        this.f8542c = str3;
        this.f8543d = zzagsVar;
        this.f8544e = str4;
        this.f8545f = str5;
        this.f8546z = str6;
    }

    public static f0 d(zzags zzagsVar) {
        com.google.android.gms.common.internal.e0.j(zzagsVar, "Must specify a non-null webSignInCredential");
        return new f0(null, null, null, zzagsVar, null, null, null);
    }

    @Override // ig.c
    public final String b() {
        return this.f8540a;
    }

    @Override // ig.c
    public final c c() {
        return new f0(this.f8540a, this.f8541b, this.f8542c, this.f8543d, this.f8544e, this.f8545f, this.f8546z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 1, this.f8540a, false);
        uk.c.c0(parcel, 2, this.f8541b, false);
        uk.c.c0(parcel, 3, this.f8542c, false);
        uk.c.b0(parcel, 4, this.f8543d, i10, false);
        uk.c.c0(parcel, 5, this.f8544e, false);
        uk.c.c0(parcel, 6, this.f8545f, false);
        uk.c.c0(parcel, 7, this.f8546z, false);
        uk.c.j0(iH0, parcel);
    }
}
