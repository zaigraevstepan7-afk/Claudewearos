package d8;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u7.k f4989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f4990d;

    public a(u7.k kVar, UUID uuid) {
        this.f4989c = kVar;
        this.f4990d = uuid;
    }

    @Override // bk.a
    public final void c() {
        u7.k kVar = this.f4989c;
        WorkDatabase workDatabase = kVar.f16842d;
        workDatabase.c();
        try {
            bk.a.a(kVar, this.f4990d.toString());
            workDatabase.q();
            workDatabase.h();
            u7.d.a(kVar.f16841c, kVar.f16842d, kVar.f16844f);
        } catch (Throwable th2) {
            workDatabase.h();
            throw th2;
        }
    }
}
