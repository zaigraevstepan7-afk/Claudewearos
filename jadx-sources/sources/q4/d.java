package q4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import xc.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13217e;

    public /* synthetic */ d(String str, Context context, Object obj, int i10, int i11) {
        this.f13213a = i11;
        this.f13214b = str;
        this.f13215c = context;
        this.f13217e = obj;
        this.f13216d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13213a) {
            case 0:
                String str = (String) this.f13214b;
                Context context = (Context) this.f13215c;
                Object[] objArr = {(c) this.f13217e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(str, context, Collections.unmodifiableList(arrayList), this.f13216d);
            case 1:
                try {
                    return g.b((String) this.f13214b, (Context) this.f13215c, (ArrayList) this.f13217e, this.f13216d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
            default:
                l lVar = (l) this.f13214b;
                zzbzc zzbzcVar = (zzbzc) this.f13215c;
                Bundle bundle = (Bundle) this.f13217e;
                return lVar.n(lVar.f19962b, zzbzcVar.zza, zzbzcVar.zzb, zzbzcVar.zzc, zzbzcVar.zzd, this.f13216d, zzbzcVar.zzf, bundle, zzbzcVar);
        }
    }

    public /* synthetic */ d(l lVar, zzbzc zzbzcVar, int i10, Bundle bundle) {
        this.f13213a = 2;
        this.f13214b = lVar;
        this.f13215c = zzbzcVar;
        this.f13216d = i10;
        this.f13217e = bundle;
    }
}
