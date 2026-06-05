package lb;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.anonlab.voidlauncher.feature.home.presentation.DevlogActivity;
import com.anonlab.voidlauncher.feature.home.presentation.settings.MoreSettingsActivity;
import com.anonlab.voidlauncher.feature.home.presentation.settings.UpdateScreenActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10293b;

    public /* synthetic */ g1(Context context, int i10) {
        this.f10292a = i10;
        this.f10293b = context;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f10292a;
        pi.o oVar = pi.o.f13011a;
        Context context = this.f10293b;
        switch (i10) {
            case 0:
                Intent intent = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                intent.putExtra("extra_screen", "lockscreen");
                context.startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar = r3.f10627b;
                intent2.putExtra("extra_screen", "passcode");
                context.startActivity(intent2);
                break;
            case 2:
                context.startActivity(new Intent(context, (Class<?>) UpdateScreenActivity.class));
                break;
            case 3:
                Intent intent3 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar2 = r3.f10627b;
                intent3.putExtra("extra_screen", "passcode");
                context.startActivity(intent3);
                break;
            case 4:
                Toast.makeText(context, "Buggy, fixing soon", 0).show();
                break;
            case 5:
                Intent intent4 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar3 = r3.f10627b;
                intent4.putExtra("extra_screen", "open_animations");
                context.startActivity(intent4);
                break;
            case 6:
                Intent intent5 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar4 = r3.f10627b;
                intent5.putExtra("extra_screen", "app_icons");
                context.startActivity(intent5);
                break;
            case 7:
                Intent intent6 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar5 = r3.f10627b;
                intent6.putExtra("extra_screen", "dock");
                context.startActivity(intent6);
                break;
            case 8:
                Intent intent7 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar6 = r3.f10627b;
                intent7.putExtra("extra_screen", "highlights");
                context.startActivity(intent7);
                break;
            case 9:
                Intent intent8 = new Intent(context, (Class<?>) MoreSettingsActivity.class);
                a aVar7 = r3.f10627b;
                intent8.putExtra("extra_screen", "sounds_vibration");
                context.startActivity(intent8);
                break;
            default:
                context.startActivity(new Intent(context, (Class<?>) DevlogActivity.class));
                break;
        }
        return oVar;
    }
}
