package jd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import ig.e0;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new e0(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f8843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8844b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8845c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8846d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8847e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f8848f;

    public a(int i10, String str, int i11, long j, byte[] bArr, Bundle bundle) {
        this.f8847e = i10;
        this.f8843a = str;
        this.f8844b = i11;
        this.f8845c = j;
        this.f8846d = bArr;
        this.f8848f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f8843a + ", method: " + this.f8844b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.c0(parcel, 1, this.f8843a, false);
        c.k0(parcel, 2, 4);
        parcel.writeInt(this.f8844b);
        c.k0(parcel, 3, 8);
        parcel.writeLong(this.f8845c);
        c.V(parcel, 4, this.f8846d, false);
        c.U(parcel, 5, this.f8848f, false);
        c.k0(parcel, zzbch.zzq.zzf, 4);
        parcel.writeInt(this.f8847e);
        c.j0(iH0, parcel);
    }
}
