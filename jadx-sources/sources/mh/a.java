package mh;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11686b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f11687c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f11688d = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11689a;

    public /* synthetic */ a(int i10) {
        this.f11689a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11689a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
