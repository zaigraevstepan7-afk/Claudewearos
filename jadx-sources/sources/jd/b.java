package jd;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import ig.e0;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends od.a {
    public static final Parcelable.Creator<b> CREATOR = new e0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f8849a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f8850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8851c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8852d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8853e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f8854f;

    public b(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f8853e = i10;
        this.f8849a = i11;
        this.f8851c = i12;
        this.f8854f = bundle;
        this.f8852d = bArr;
        this.f8850b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = c.h0(20293, parcel);
        c.k0(parcel, 1, 4);
        parcel.writeInt(this.f8849a);
        c.b0(parcel, 2, this.f8850b, i10, false);
        c.k0(parcel, 3, 4);
        parcel.writeInt(this.f8851c);
        c.U(parcel, 4, this.f8854f, false);
        c.V(parcel, 5, this.f8852d, false);
        c.k0(parcel, zzbch.zzq.zzf, 4);
        parcel.writeInt(this.f8853e);
        c.j0(iH0, parcel);
    }
}
