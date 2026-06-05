package d8;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u7.k f4992d;

    public /* synthetic */ b(u7.k kVar, int i10) {
        this.f4991c = i10;
        this.f4992d = kVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // bk.a
    public final void c() {
        switch (this.f4991c) {
            case 0:
                u7.k kVar = this.f4992d;
                WorkDatabase workDatabase = kVar.f16842d;
                workDatabase.c();
                try {
                    ArrayList arrayListG = workDatabase.w().g();
                    int size = arrayListG.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListG.get(i10);
                        i10++;
                        bk.a.a(kVar, (String) obj);
                    }
                    workDatabase.q();
                    workDatabase.h();
                    u7.d.a(kVar.f16841c, kVar.f16842d, kVar.f16844f);
                    return;
                } catch (Throwable th2) {
                    workDatabase.h();
                    throw th2;
                }
            default:
                u7.k kVar2 = this.f4992d;
                WorkDatabase workDatabase2 = kVar2.f16842d;
                workDatabase2.c();
                try {
                    ArrayList arrayListF = workDatabase2.w().f();
                    int size2 = arrayListF.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayListF.get(i11);
                        i11++;
                        bk.a.a(kVar2, (String) obj2);
                    }
                    workDatabase2.q();
                    workDatabase2.h();
                    return;
                } catch (Throwable th3) {
                    workDatabase2.h();
                    throw th3;
                }
        }
    }
}
