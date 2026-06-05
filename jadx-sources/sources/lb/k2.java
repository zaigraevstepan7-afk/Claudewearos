package lb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Process;
import com.anonlab.voidlauncher.R;
import com.anonlab.voidlauncher.feature.home.presentation.liquidglass.LiquidGlassPlaygroundActivity;
import com.anonlab.voidlauncher.feature.home.presentation.rain.RainPlaygroundActivity;
import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10420c;

    public /* synthetic */ k2(Context context, f1.a1 a1Var, int i10) {
        this.f10418a = i10;
        this.f10419b = context;
        this.f10420c = a1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f10418a) {
            case 0:
                Context context = this.f10419b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(335544320);
                } else {
                    launchIntentForPackage = null;
                }
                if (launchIntentForPackage != null) {
                    context.startActivity(launchIntentForPackage);
                    Process.killProcess(Process.myPid());
                } else {
                    this.f10420c.setValue(Boolean.FALSE);
                }
                return pi.o.f13011a;
            case 1:
                Context context2 = this.f10419b;
                fj.l.f(context2, "context");
                File file = new File(context2.getFilesDir(), "wallpapers");
                Iterator it = mb.a.p(context2).values().iterator();
                while (it.hasNext()) {
                    try {
                        new File(file, ((mb.c) it.next()).f11441a).delete();
                    } catch (Throwable th2) {
                        uk.c.r(th2);
                    }
                }
                mb.a.q(context2, qi.t.f13521a);
                this.f10420c.setValue(Boolean.FALSE);
                break;
            case 2:
                ra.b.v(this.f10420c, false);
                Context context3 = this.f10419b;
                context3.startActivity(new Intent(context3, (Class<?>) LiquidGlassPlaygroundActivity.class));
                break;
            case 3:
                ra.b.v(this.f10420c, false);
                Context context4 = this.f10419b;
                context4.startActivity(new Intent(context4, (Class<?>) RainPlaygroundActivity.class));
                break;
            default:
                Context context5 = this.f10419b;
                fj.l.f(context5, "context");
                Resources resources = context5.getResources();
                this.f10420c.setValue(new xa.b(r2.m() / 100.0f, r2.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new g(context5).n()));
                break;
        }
        return pi.o.f13011a;
    }
}
