package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import mc.n;
import qc.l0;
import qc.o0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzazq {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbaf zze;
    private final zzban zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzazq(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z2;
        this.zze = new zzbaf(i13);
        this.zzf = new zzban(i14, i15, i16);
    }

    private final void zzm(String str, boolean z2, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z2) {
                        this.zzi.add(str);
                        this.zzj.add(new zzbab(f10, f11, f12, f13, r10.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazq) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder sbQ = gk.b.q("ActivityContent fetchId: ", i10, " score:", i11, " total_length:");
        sbQ.append(i12);
        sbQ.append("\n text: ");
        sbQ.append(strZzn);
        sbQ.append("\n viewableText");
        m1.s(sbQ, strZzn2, "\n signture: ", str, "\n viewableSignture: ");
        sbQ.append(str2);
        sbQ.append("\n viewableSignatureForVertical: ");
        sbQ.append(str3);
        return sbQ.toString();
    }

    public final int zza(int i10, int i11) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i11 * this.zzb) + (i10 * this.zza);
    }

    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i10) {
        this.zzl = i10;
    }

    public final void zzh(String str, boolean z2, float f10, float f11, float f12, float f13) {
        zzm(str, z2, f10, f11, f12, f13);
    }

    public final void zzi(String str, boolean z2, float f10, float f11, float f12, float f13) {
        zzm(str, z2, f10, f11, f12, f13);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i10 = l0.f13401b;
                    k.b("ActivityContent: negative number of WebViews.");
                }
                zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                    n nVar = n.D;
                    if (!((o0) nVar.f11582h.zzi()).i()) {
                        zzbaf zzbafVar = this.zze;
                        this.zzo = zzbafVar.zza(this.zzh);
                        this.zzp = zzbafVar.zza(this.zzi);
                    }
                    if (!((o0) nVar.f11582h.zzi()).j()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzl() {
        boolean z2;
        synchronized (this.zzg) {
            z2 = this.zzm == 0;
        }
        return z2;
    }
}
