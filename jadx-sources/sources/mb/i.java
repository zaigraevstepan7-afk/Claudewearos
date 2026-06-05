package mb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import f1.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float[] f11461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f11462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f11464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f11465e;

    public i(float[] fArr, float[] fArr2, float f10, f1 f1Var, f1 f1Var2) {
        this.f11461a = fArr;
        this.f11462b = fArr2;
        this.f11463c = f10;
        this.f11464d = f1Var;
        this.f11465e = f1Var2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        fj.l.f(sensorEvent, "event");
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f11461a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] fArr3 = this.f11462b;
        SensorManager.getOrientation(fArr2, fArr3);
        float fO = cg.b.o(fArr3[2], -0.6f, 0.6f);
        float fO2 = cg.b.o(fArr3[1], -0.6f, 0.6f);
        float fO3 = cg.b.o(fO / 0.6f, -1.0f, 1.0f);
        float fO4 = cg.b.o(fO2 / 0.6f, -1.0f, 1.0f);
        f1 f1Var = this.f11464d;
        float fG = f1Var.g();
        float f10 = this.f11463c;
        f1Var.h(((((-fO3) * f10) - f1Var.g()) * 0.14f) + fG);
        f1 f1Var2 = this.f11465e;
        f1Var2.h((((fO4 * f10) - f1Var2.g()) * 0.14f) + f1Var2.g());
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
