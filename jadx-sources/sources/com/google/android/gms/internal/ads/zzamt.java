package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamt implements zzamx {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaez zzi;
    private zzaez zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaez zzw;
    private long zzx;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzamt(boolean z2, String str, int i10, String str2) {
        this.zzb = z2;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzh();
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzh();
    }

    private final void zzh() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzi() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private final void zzj(zzaez zzaezVar, long j, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzaezVar;
        this.zzx = j;
        this.zzu = i11;
    }

    private final boolean zzk(zzen zzenVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzenVar.zza(), i10 - this.zzl);
        zzenVar.zzH(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzen zzenVar, byte[] bArr, int i10) {
        if (zzenVar.zza() < i10) {
            return false;
        }
        zzenVar.zzH(bArr, 0, i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024e, code lost:
    
        r18.zzk = 1;
        r18.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0257, code lost:
    
        r19.zzL(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023a, code lost:
    
        r18.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0243, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0245, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0247, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0248, code lost:
    
        r18.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024c, code lost:
    
        if (r18.zzo != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023a A[EDGE_INSN: B:143:0x023a->B:94:0x023a BREAK  A[LOOP:1: B:48:0x0193->B:169:0x0193], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r19) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzh = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 1);
        this.zzi = zzaezVarZzw;
        this.zzw = zzaezVarZzw;
        if (!this.zzb) {
            this.zzj = new zzadp();
            return;
        }
        zzaolVar.zzc();
        zzaez zzaezVarZzw2 = zzadwVar.zzw(zzaolVar.zza(), 5);
        this.zzj = zzaezVarZzw2;
        zzx zzxVar = new zzx();
        zzxVar.zzS(zzaolVar.zzb());
        zzxVar.zzG(this.zzg);
        zzxVar.zzah("application/id3");
        zzaezVarZzw2.zzm(zzxVar.zzan());
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzv = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
    }
}
