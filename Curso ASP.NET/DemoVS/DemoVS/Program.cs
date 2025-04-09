// Configura��es Builder
using DemoVS;

var builder = WebApplication.CreateBuilder(args);

//Configura��es do Pipeline
builder.AddSerilog();

builder.Services.AddControllersWithViews();

//Configura��o da App
var app = builder.Build();

app.UseLogTempo();
app.UseMiddleware<MeuMiddleware>();

app.MapGet("/", () => "Hello World!");
app.MapGet("/teste", () => 
{
    Thread.Sleep(1500);
    return "Teste 2";
});

app.Run();
