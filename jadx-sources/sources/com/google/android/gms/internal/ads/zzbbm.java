package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbm extends od.a {
    public static final Parcelable.Creator<zzbbm> CREATOR = new zzbbn();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbbm(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z2, long j4, String str5, int i10) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z2;
        this.zzh = j4;
        this.zzi = str5;
        this.zzj = i10;
    }

    public static zzbbm zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                String str = "Expected 2 path parts for namespace and id, found :" + pathSegments.size();
                int i10 = l0.f13401b;
                k.g(str);
                return null;
            }
            String str2 = pathSegments.get(0);
            String str3 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str4 : uri.getQueryParameterNames()) {
                if (str4.startsWith("tag.")) {
                    bundle.putString(str4.substring(4), uri.getQueryParameter(str4));
                }
            }
            return new zzbbm(queryParameter, j, host, str2, str3, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e10) {
            e = e10;
            int i11 = l0.f13401b;
            k.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            int i112 = l0.f13401b;
            k.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.c0(parcel, 2, str, false);
        long j = this.zzb;
        uk.c.k0(parcel, 3, 8);
        parcel.writeLong(j);
        uk.c.c0(parcel, 4, this.zzc, false);
        uk.c.c0(parcel, 5, this.zzd, false);
        uk.c.c0(parcel, 6, this.zze, false);
        uk.c.U(parcel, 7, this.zzf, false);
        boolean z2 = this.zzg;
        uk.c.k0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j4 = this.zzh;
        uk.c.k0(parcel, 9, 8);
        parcel.writeLong(j4);
        uk.c.c0(parcel, 10, this.zzi, false);
        int i11 = this.zzj;
        uk.c.k0(parcel, 11, 4);
        parcel.writeInt(i11);
        uk.c.j0(iH0, parcel);
    }
}
