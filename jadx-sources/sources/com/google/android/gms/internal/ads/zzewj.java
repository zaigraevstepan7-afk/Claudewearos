package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewj implements zzhfy {
    public static zzetx zza(Context context, zzbze zzbzeVar, zzbzf zzbzfVar, Object obj, zzeva zzevaVar, zzevu zzevuVar, zzhfs zzhfsVar, zzhfs zzhfsVar2, zzhfs zzhfsVar3, zzhfs zzhfsVar4, zzhfs zzhfsVar5, zzhfs zzhfsVar6, zzhfs zzhfsVar7, Executor executor, zzfhm zzfhmVar, zzdsc zzdscVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevn) obj);
        hashSet.add(zzevaVar);
        hashSet.add(zzevuVar);
        zzbct zzbctVar = zzbdc.zzfW;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar.zzb());
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzfX)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar2.zzb());
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzfZ)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar4.zzb());
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzga)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar5.zzb());
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzdl)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar7.zzb());
        }
        return new zzetx(context, executor, hashSet, zzfhmVar, zzdscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
