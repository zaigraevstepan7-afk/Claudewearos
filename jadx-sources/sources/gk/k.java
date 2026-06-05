package gk;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7478c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Object[] objArr, int i10, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f7480e = qVar;
        this.f7479d = i10;
    }

    @Override // bk.a
    public final void b() {
        switch (this.f7478c) {
            case 0:
                this.f7480e.C.getClass();
                try {
                    this.f7480e.M.t(this.f7479d, 6);
                    synchronized (this.f7480e) {
                        this.f7480e.O.remove(Integer.valueOf(this.f7479d));
                    }
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                this.f7480e.C.getClass();
                try {
                    this.f7480e.M.t(this.f7479d, 6);
                    synchronized (this.f7480e) {
                        this.f7480e.O.remove(Integer.valueOf(this.f7479d));
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                this.f7480e.C.getClass();
                synchronized (this.f7480e) {
                    this.f7480e.O.remove(Integer.valueOf(this.f7479d));
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Object[] objArr, int i10, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f7480e = qVar;
        this.f7479d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f7480e = qVar;
        this.f7479d = i10;
    }
}
