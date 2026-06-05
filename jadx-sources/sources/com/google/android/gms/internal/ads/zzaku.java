package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaku implements zzaez {
    private final zzaez zza;
    private final zzakp zzb;
    private zzakr zzg;
    private zzz zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzex.zzb;
    private final zzen zzc = new zzen();

    public zzaku(zzaez zzaezVar, zzakp zzakpVar) {
        this.zza = zzaezVar;
        this.zzb = zzakpVar;
    }

    public static /* synthetic */ void zza(zzaku zzakuVar, long j, int i10, zzakj zzakjVar) {
        zzdd.zzb(zzakuVar.zzh);
        zzfyf zzfyfVar = zzakjVar.zza;
        long j4 = zzakjVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfyfVar.size());
        Iterator<E> it = zzfyfVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcu) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j4);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzen zzenVar = zzakuVar.zzc;
        int length = bArrMarshall.length;
        zzenVar.zzJ(bArrMarshall, length);
        zzaez zzaezVar = zzakuVar.zza;
        zzaezVar.zzr(zzenVar, length);
        long j10 = zzakjVar.zzb;
        if (j10 == -9223372036854775807L) {
            zzdd.zzf(zzakuVar.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j11 = zzakuVar.zzh.zzt;
            j = j11 == Long.MAX_VALUE ? j + j10 : j10 + j11;
        }
        zzaezVar.zzt(j, i10 | 1, length, 0, null);
    }

    private final void zzc(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    public final void zzb(boolean z2) {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z2) {
        return zzaex.zza(this, zzlVar, i10, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i10, boolean z2, int i11) throws EOFException {
        if (this.zzg == null) {
            return this.zza.zzg(zzlVar, i10, z2, 0);
        }
        zzc(i10);
        int iZza = zzlVar.zza(this.zzf, this.zze, i10);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
        String str = zzzVar.zzo;
        str.getClass();
        zzdd.zzd(zzay.zzb(str) == 3);
        if (!zzzVar.equals(this.zzh)) {
            this.zzh = zzzVar;
            zzakp zzakpVar = this.zzb;
            this.zzg = zzakpVar.zzc(zzzVar) ? zzakpVar.zzb(zzzVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzzVar);
            return;
        }
        zzaez zzaezVar = this.zza;
        zzx zzxVarZzb = zzzVar.zzb();
        zzxVarZzb.zzah("application/x-media3-cues");
        zzxVarZzb.zzE(str);
        zzxVarZzb.zzal(Long.MAX_VALUE);
        zzxVarZzb.zzI(this.zzb.zza(zzzVar));
        zzaezVar.zzm(zzxVarZzb.zzan());
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i10) {
        zzaex.zzb(this, zzenVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzs(zzenVar, i10, i11);
            return;
        }
        zzc(i10);
        zzenVar.zzH(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(final long j, final int i10, int i11, int i12, zzaey zzaeyVar) {
        if (this.zzg == null) {
            this.zza.zzt(j, i10, i11, i12, zzaeyVar);
            return;
        }
        zzdd.zze(zzaeyVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        try {
            this.zzg.zza(this.zzf, i13, i11, zzakq.zza(), new zzdn() { // from class: com.google.android.gms.internal.ads.zzakt
                @Override // com.google.android.gms.internal.ads.zzdn
                public final void zza(Object obj) {
                    zzaku.zza(this.zza, j, i10, (zzakj) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.zzi) {
                throw e10;
            }
            zzea.zzg("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j) {
    }
}
