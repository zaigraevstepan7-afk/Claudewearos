package lg;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f10953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p7.k f10954d;

    public /* synthetic */ d(f fVar, Runnable runnable, p7.k kVar, int i10) {
        this.f10951a = i10;
        this.f10952b = fVar;
        this.f10953c = runnable;
        this.f10954d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10951a) {
            case 0:
                ExecutorService executorService = this.f10952b.f10958a;
                final int i10 = 0;
                final Runnable runnable = this.f10953c;
                final p7.k kVar = this.f10954d;
                executorService.execute(new Runnable() { // from class: lg.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) kVar.f12813b).x(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) kVar.f12813b).x(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) kVar.f12813b;
                                try {
                                    runnable2.run();
                                    hVar.w(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.x(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f10952b.f10958a;
                final int i11 = 2;
                final Runnable runnable2 = this.f10953c;
                final p7.k kVar2 = this.f10954d;
                executorService2.execute(new Runnable() { // from class: lg.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) kVar2.f12813b).x(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) kVar2.f12813b).x(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) kVar2.f12813b;
                                try {
                                    runnable22.run();
                                    hVar.w(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.x(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f10952b.f10958a;
                final int i12 = 1;
                final Runnable runnable3 = this.f10953c;
                final p7.k kVar3 = this.f10954d;
                executorService3.execute(new Runnable() { // from class: lg.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) kVar3.f12813b).x(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) kVar3.f12813b).x(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) kVar3.f12813b;
                                try {
                                    runnable22.run();
                                    hVar.w(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.x(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
