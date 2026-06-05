package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzck {
    private final zzfyf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzfyf zzfyfVar) {
        this.zza = zzfyfVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z2;
        do {
            int i10 = 0;
            z2 = false;
            while (i10 <= zzi()) {
                if (!this.zzc[i10].hasRemaining()) {
                    List list = this.zzb;
                    zzcn zzcnVar = (zzcn) list.get(i10);
                    if (!zzcnVar.zzh()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcn.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcnVar.zze(byteBuffer2);
                        this.zzc[i10] = zzcnVar.zzb();
                        boolean z10 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.zzc[i10].hasRemaining()) {
                            z10 = false;
                        }
                        z2 |= z10;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                        ((zzcn) list.get(i10 + 1)).zzd();
                    }
                }
                i10++;
            }
        } while (z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzfyf zzfyfVar = this.zza;
        int size = zzfyfVar.size();
        zzfyf zzfyfVar2 = ((zzck) obj).zza;
        if (size != zzfyfVar2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < zzfyfVar.size(); i10++) {
            if (zzfyfVar.get(i10) != zzfyfVar2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                return zzclVar;
            }
            zzcn zzcnVar = (zzcn) zzfyfVar.get(i10);
            zzcl zzclVarZza = zzcnVar.zza(zzclVar);
            if (zzcnVar.zzg()) {
                zzdd.zzf(!zzclVarZza.equals(r0));
                zzclVar = zzclVarZza;
            }
            i10++;
        }
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcn.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcn.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                break;
            }
            zzcn zzcnVar = (zzcn) zzfyfVar.get(i10);
            zzcnVar.zzc();
            if (zzcnVar.zzg()) {
                list.add(zzcnVar);
            }
            i10++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzcn) list.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcn) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzcn zzcnVar = (zzcn) zzfyfVar.get(i10);
                zzcnVar.zzc();
                zzcnVar.zzf();
                i10++;
            }
        }
    }

    public final boolean zzg() {
        return this.zzd && ((zzcn) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
