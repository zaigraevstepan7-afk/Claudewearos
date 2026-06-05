package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdo extends zzcdl {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdo(zzcbz zzcbzVar) {
        super(zzcbzVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i10 = l0.f13401b;
            k.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqk.zza(zzfqj.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i11 = l0.f13401b;
            k.g("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i12 = l0.f13401b;
        k.g("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqk.zza(zzfqj.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03de  */
    @Override // com.google.android.gms.internal.ads.zzcdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(final java.lang.String r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdo.zzt(java.lang.String):boolean");
    }
}
