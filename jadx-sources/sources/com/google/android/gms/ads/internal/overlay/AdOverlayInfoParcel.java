package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdfv;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzecd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mc.n;
import nc.t;
import od.a;
import pc.c;
import pc.e;
import pc.j;
import pc.k;
import pc.l;
import pc.m;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new j(0);
    public static final AtomicLong R = new AtomicLong(0);
    public static final ConcurrentHashMap S = new ConcurrentHashMap();
    public final String A;
    public final c B;
    public final int C;
    public final int D;
    public final String E;
    public final rc.a F;
    public final String G;
    public final mc.j H;
    public final zzbit I;
    public final String J;
    public final String K;
    public final String L;
    public final zzcwe M;
    public final zzddw N;
    public final zzbth O;
    public final boolean P;
    public final long Q;

    /* renamed from: a, reason: collision with root package name */
    public final e f3441a;

    /* renamed from: b, reason: collision with root package name */
    public final nc.a f3442b;

    /* renamed from: c, reason: collision with root package name */
    public final m f3443c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcfe f3444d;

    /* renamed from: e, reason: collision with root package name */
    public final zzbiv f3445e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3446f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f3447z;

    public AdOverlayInfoParcel(zzcfe zzcfeVar, rc.a aVar, String str, String str2, zzbth zzbthVar) {
        this.f3441a = null;
        this.f3442b = null;
        this.f3443c = null;
        this.f3444d = zzcfeVar;
        this.I = null;
        this.f3445e = null;
        this.f3446f = null;
        this.f3447z = false;
        this.A = null;
        this.B = null;
        this.C = 14;
        this.D = 5;
        this.E = null;
        this.F = aVar;
        this.G = null;
        this.H = null;
        this.J = str;
        this.K = str2;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = zzbthVar;
        this.P = false;
        this.Q = R.getAndIncrement();
    }

    public static AdOverlayInfoParcel b(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznd)).booleanValue()) {
                return null;
            }
            n.D.f11582h.zzw(e10, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    public static final IBinder c(Object obj) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznd)).booleanValue()) {
            return null;
        }
        return new b(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f3441a, i10, false);
        nc.a aVar = this.f3442b;
        uk.c.X(parcel, 3, c(aVar));
        m mVar = this.f3443c;
        uk.c.X(parcel, 4, c(mVar));
        zzcfe zzcfeVar = this.f3444d;
        uk.c.X(parcel, 5, c(zzcfeVar));
        zzbiv zzbivVar = this.f3445e;
        uk.c.X(parcel, 6, c(zzbivVar));
        uk.c.c0(parcel, 7, this.f3446f, false);
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(this.f3447z ? 1 : 0);
        uk.c.c0(parcel, 9, this.A, false);
        c cVar = this.B;
        uk.c.X(parcel, 10, c(cVar));
        uk.c.k0(parcel, 11, 4);
        parcel.writeInt(this.C);
        uk.c.k0(parcel, 12, 4);
        parcel.writeInt(this.D);
        uk.c.c0(parcel, 13, this.E, false);
        uk.c.b0(parcel, 14, this.F, i10, false);
        uk.c.c0(parcel, 16, this.G, false);
        uk.c.b0(parcel, 17, this.H, i10, false);
        zzbit zzbitVar = this.I;
        uk.c.X(parcel, 18, c(zzbitVar));
        uk.c.c0(parcel, 19, this.J, false);
        uk.c.c0(parcel, 24, this.K, false);
        uk.c.c0(parcel, 25, this.L, false);
        zzcwe zzcweVar = this.M;
        uk.c.X(parcel, 26, c(zzcweVar));
        zzddw zzddwVar = this.N;
        uk.c.X(parcel, 27, c(zzddwVar));
        zzbth zzbthVar = this.O;
        uk.c.X(parcel, 28, c(zzbthVar));
        uk.c.k0(parcel, 29, 4);
        parcel.writeInt(this.P ? 1 : 0);
        uk.c.k0(parcel, 30, 8);
        long j = this.Q;
        parcel.writeLong(j);
        uk.c.j0(iH0, parcel);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznd)).booleanValue()) {
            S.put(Long.valueOf(j), new k(aVar, mVar, zzcfeVar, zzbitVar, zzbivVar, cVar, zzcweVar, zzddwVar, zzbthVar, zzcad.zzd.schedule(new l(j), ((Integer) r2.f12230c.zzb(zzbdc.zznf)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(zzdfv zzdfvVar, zzcfe zzcfeVar, int i10, rc.a aVar, String str, mc.j jVar, String str2, String str3, String str4, zzcwe zzcweVar, zzecd zzecdVar, String str5) {
        this.f3441a = null;
        this.f3442b = null;
        this.f3443c = zzdfvVar;
        this.f3444d = zzcfeVar;
        this.I = null;
        this.f3445e = null;
        this.f3447z = false;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaV)).booleanValue()) {
            this.f3446f = null;
            this.A = null;
        } else {
            this.f3446f = str2;
            this.A = str3;
        }
        this.B = null;
        this.C = i10;
        this.D = 1;
        this.E = null;
        this.F = aVar;
        this.G = str;
        this.H = jVar;
        this.J = str5;
        this.K = null;
        this.L = str4;
        this.M = zzcweVar;
        this.N = null;
        this.O = zzecdVar;
        this.P = false;
        this.Q = R.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdvm zzdvmVar, zzcfe zzcfeVar, rc.a aVar) {
        this.f3443c = zzdvmVar;
        this.f3444d = zzcfeVar;
        this.C = 1;
        this.F = aVar;
        this.f3441a = null;
        this.f3442b = null;
        this.I = null;
        this.f3445e = null;
        this.f3446f = null;
        this.f3447z = false;
        this.A = null;
        this.B = null;
        this.D = 1;
        this.E = null;
        this.G = null;
        this.H = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.Q = R.getAndIncrement();
    }

    public AdOverlayInfoParcel(nc.a aVar, m mVar, zzbit zzbitVar, zzbiv zzbivVar, c cVar, zzcfe zzcfeVar, boolean z2, int i10, String str, String str2, rc.a aVar2, zzddw zzddwVar, zzecd zzecdVar) {
        this.f3441a = null;
        this.f3442b = aVar;
        this.f3443c = mVar;
        this.f3444d = zzcfeVar;
        this.I = zzbitVar;
        this.f3445e = zzbivVar;
        this.f3446f = str2;
        this.f3447z = z2;
        this.A = str;
        this.B = cVar;
        this.C = i10;
        this.D = 3;
        this.E = null;
        this.F = aVar2;
        this.G = null;
        this.H = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = zzddwVar;
        this.O = zzecdVar;
        this.P = false;
        this.Q = R.getAndIncrement();
    }

    public AdOverlayInfoParcel(nc.a aVar, m mVar, zzbit zzbitVar, zzbiv zzbivVar, c cVar, zzcfe zzcfeVar, boolean z2, int i10, String str, rc.a aVar2, zzddw zzddwVar, zzecd zzecdVar, boolean z10) {
        this.f3441a = null;
        this.f3442b = aVar;
        this.f3443c = mVar;
        this.f3444d = zzcfeVar;
        this.I = zzbitVar;
        this.f3445e = zzbivVar;
        this.f3446f = null;
        this.f3447z = z2;
        this.A = null;
        this.B = cVar;
        this.C = i10;
        this.D = 3;
        this.E = str;
        this.F = aVar2;
        this.G = null;
        this.H = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = zzddwVar;
        this.O = zzecdVar;
        this.P = z10;
        this.Q = R.getAndIncrement();
    }

    public AdOverlayInfoParcel(nc.a aVar, m mVar, c cVar, zzcfe zzcfeVar, boolean z2, int i10, rc.a aVar2, zzddw zzddwVar, zzecd zzecdVar) {
        this.f3441a = null;
        this.f3442b = aVar;
        this.f3443c = mVar;
        this.f3444d = zzcfeVar;
        this.I = null;
        this.f3445e = null;
        this.f3446f = null;
        this.f3447z = z2;
        this.A = null;
        this.B = cVar;
        this.C = i10;
        this.D = 2;
        this.E = null;
        this.F = aVar2;
        this.G = null;
        this.H = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = zzddwVar;
        this.O = zzecdVar;
        this.P = false;
        this.Q = R.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z2, String str2, IBinder iBinder5, int i10, int i11, String str3, rc.a aVar, String str4, mc.j jVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j) {
        this.f3441a = eVar;
        this.f3446f = str;
        this.f3447z = z2;
        this.A = str2;
        this.C = i10;
        this.D = i11;
        this.E = str3;
        this.F = aVar;
        this.G = str4;
        this.H = jVar;
        this.J = str5;
        this.K = str6;
        this.L = str7;
        this.P = z10;
        this.Q = j;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznd)).booleanValue()) {
            k kVar = (k) S.remove(Long.valueOf(j));
            if (kVar != null) {
                this.f3442b = kVar.f12849a;
                this.f3443c = kVar.f12850b;
                this.f3444d = kVar.f12851c;
                this.I = kVar.f12852d;
                this.f3445e = kVar.f12853e;
                this.M = kVar.f12855g;
                this.N = kVar.f12856h;
                this.O = kVar.f12857i;
                this.B = kVar.f12854f;
                kVar.j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f3442b = (nc.a) b.u(b.n(iBinder));
        this.f3443c = (m) b.u(b.n(iBinder2));
        this.f3444d = (zzcfe) b.u(b.n(iBinder3));
        this.I = (zzbit) b.u(b.n(iBinder6));
        this.f3445e = (zzbiv) b.u(b.n(iBinder4));
        this.B = (c) b.u(b.n(iBinder5));
        this.M = (zzcwe) b.u(b.n(iBinder7));
        this.N = (zzddw) b.u(b.n(iBinder8));
        this.O = (zzbth) b.u(b.n(iBinder9));
    }

    public AdOverlayInfoParcel(e eVar, nc.a aVar, m mVar, c cVar, rc.a aVar2, zzcfe zzcfeVar, zzddw zzddwVar, String str) {
        this.f3441a = eVar;
        this.f3442b = aVar;
        this.f3443c = mVar;
        this.f3444d = zzcfeVar;
        this.I = null;
        this.f3445e = null;
        this.f3446f = null;
        this.f3447z = false;
        this.A = null;
        this.B = cVar;
        this.C = -1;
        this.D = 4;
        this.E = null;
        this.F = aVar2;
        this.G = null;
        this.H = null;
        this.J = str;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = zzddwVar;
        this.O = null;
        this.P = false;
        this.Q = R.getAndIncrement();
    }
}
