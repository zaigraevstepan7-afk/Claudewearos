package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzes extends zzei {
    private final zzdn zza;
    private final Level zzb;
    private final Set zzc;
    private final zzea zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(String str, @NullableDecl String str2, boolean z2, zzdn zzdnVar, boolean z10, boolean z11) {
        super(str2);
        Level level = Level.ALL;
        Set set = zzeu.zza;
        zzea zzeaVar = zzeu.zzb;
        this.zza = zzdnVar;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzeaVar;
    }
}
