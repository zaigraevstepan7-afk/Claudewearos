package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class Status extends od.a implements t, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f3493c;

    /* renamed from: d, reason: collision with root package name */
    public final nd.b f3494d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f3488e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f3489f = new Status(14, null, null, null);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f3490z = new Status(8, null, null, null);
    public static final Status A = new Status(15, null, null, null);
    public static final Status B = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new x0(16);

    public Status(int i10, String str, PendingIntent pendingIntent, nd.b bVar) {
        this.f3491a = i10;
        this.f3492b = str;
        this.f3493c = pendingIntent;
        this.f3494d = bVar;
    }

    public final boolean b() {
        return this.f3491a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3491a == status.f3491a && e0.l(this.f3492b, status.f3492b) && e0.l(this.f3493c, status.f3493c) && e0.l(this.f3494d, status.f3494d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3491a), this.f3492b, this.f3493c, this.f3494d});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        String strD = this.f3492b;
        if (strD == null) {
            strD = wd.a.D(this.f3491a);
        }
        jVar.g(strD, "statusCode");
        jVar.g(this.f3493c, "resolution");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3491a);
        uk.c.c0(parcel, 2, this.f3492b, false);
        uk.c.b0(parcel, 3, this.f3493c, i10, false);
        uk.c.b0(parcel, 4, this.f3494d, i10, false);
        uk.c.j0(iH0, parcel);
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this;
    }
}
