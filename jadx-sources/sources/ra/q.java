package ra;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import b0.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb.g f14129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14131d;

    public /* synthetic */ q(Context context, f1.a1 a1Var, lb.g gVar) {
        this.f14128a = 2;
        this.f14130c = context;
        this.f14129b = gVar;
        this.f14131d = a1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14128a) {
            case 0:
                Context context = this.f14130c;
                g.a aVar = (g.a) obj;
                fj.l.f(aVar, "result");
                if (aVar.f6831a == -1) {
                    Intent intent = aVar.f6832b;
                    Uri data = intent != null ? intent.getData() : null;
                    if (data != null) {
                        try {
                            context.getContentResolver().takePersistableUriPermission(data, 1);
                        } catch (Throwable th2) {
                            uk.c.r(th2);
                        }
                        this.f14129b.C(data);
                        this.f14131d.setValue(data);
                    }
                }
                return pi.o.f13011a;
            case 1:
                Context context2 = this.f14130c;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context2.getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Throwable th3) {
                        uk.c.r(th3);
                    }
                    this.f14129b.C(uri);
                    this.f14131d.setValue(uri);
                }
                return pi.o.f13011a;
            default:
                fj.l.f((f1.b0) obj, "$this$DisposableEffect");
                Context context3 = this.f14130c;
                g0 g0Var = new g0(context3, this.f14131d, this.f14129b);
                IntentFilter intentFilter = new IntentFilter("com.anonlab.photos.WALLPAPER_SELECTED");
                if (Build.VERSION.SDK_INT >= 33) {
                    context3.registerReceiver(g0Var, intentFilter, 4);
                } else {
                    context3.registerReceiver(g0Var, intentFilter);
                }
                return new e2(9, context3, g0Var);
        }
    }

    public /* synthetic */ q(lb.g gVar, Context context, f1.a1 a1Var, int i10) {
        this.f14128a = i10;
        this.f14129b = gVar;
        this.f14130c = context;
        this.f14131d = a1Var;
    }
}
